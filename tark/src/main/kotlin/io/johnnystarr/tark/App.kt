package io.johnnystarr.tark

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

object Users : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", length = 50) // Column<String>
    override val primaryKey = PrimaryKey(id)
}

class App {
    val bootMessage: String = "TARK version ${Config.VERSION}"
}

fun main() {
    Terminal.write(Config.SPLASH)
    Terminal.write("{w${App().bootMessage}")
    initDatabase()

    transaction {
        SchemaUtils.create(Users)

        Users.deleteAll()

        Users.insert {
            it[name] = "Johnny"
        }

        Users.selectAll().forEach {
            println(it[Users.name])
        }
    }
}

fun initDatabase(){
    val workingDir = System.getProperty("user.dir")
    val hikariConfig = HikariConfig("${workingDir}/db.properties")
    val dataSource = HikariDataSource(hikariConfig)
    Database.connect(dataSource)
}
