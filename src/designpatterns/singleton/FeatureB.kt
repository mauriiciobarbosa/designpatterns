package designpatterns.singleton

import designpatterns.singleton.model.Database
import designpatterns.singleton.model.Query

class FeatureB(
    private val database: Database = Database.instance
) {
    fun getNumberOfRows(): Int {
        return database.query(Query("Select COUNT(*) FROM FeatureB")).numberOfRows
    }
}