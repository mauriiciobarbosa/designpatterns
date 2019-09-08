package designpatterns.singleton

fun main() {
    val featureA = FeatureA()
    val featureB = FeatureB()

    println("Number of rows for FeatureA: ${featureA.getNumberOfRows()}")
    println("Number of rows for FeatureB: ${featureB.getNumberOfRows()}")
}