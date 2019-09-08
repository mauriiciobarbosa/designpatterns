package designpatterns.singleton.model

import kotlin.random.Random

class Database private constructor() {
    companion object {
        val instance: Database by lazy {
            Database()
        }
    }

    fun query(sql: Query): Result {
        println("querying ${sql.select}")
        return Result(sql.select, Random.nextInt(1000))
    }
}