package io.johnnystarr.tark

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.flywaydb.core.Flyway
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.deleteAll
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class App {
    val bootMessage: String = "TARK version ${Config.VERSION}"
}

fun main() {
    Terminal.write(Config.SPLASH)
    Terminal.write("{w${App().bootMessage}")
    initDatabase()

    transaction {
        Users.deleteAll()

        Users.insert {
            it[name] = "Johnny"
            it[age] = 1
        }

        Users.selectAll().forEach {
            println(it[Users.name])
            println("Age is " + it[Users.age])
        }
    }
}

fun initDatabase(){
    val workingDir = System.getProperty("user.dir")
    val hikariConfig = HikariConfig("${workingDir}/../db.properties")
    val dataSource = HikariDataSource(hikariConfig)

    val flyway = Flyway.configure().dataSource(dataSource).load()
    flyway.migrate()
    Database.connect(dataSource)
}
