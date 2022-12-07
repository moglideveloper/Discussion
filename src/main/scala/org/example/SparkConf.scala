package org.example

import org.apache.spark.sql.SparkSession
import org.apache.spark._

object SparkConf {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Discussion").setMaster("local")
    val spark = SparkSession.builder.config(conf).getOrCreate()

    val data = List("John", "Tony")

    val rdd = spark.sparkContext.parallelize(data)

    rdd.collect().foreach( println )
  }
}
