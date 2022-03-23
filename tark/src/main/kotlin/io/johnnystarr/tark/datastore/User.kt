package io.johnnystarr.tark.datastore
import org.jetbrains.exposed.sql.Table

object Users : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", length = 50) // Column<String>
    override val primaryKey = PrimaryKey(id)
}