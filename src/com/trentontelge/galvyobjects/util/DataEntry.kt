package com.trentontelge.galvyobjects.util

class DataEntry{
    var segmentID: Int = 0
    var stationID: Int = 0
    var stationDesc: String = ""
    lateinit var startDate: SimpleDate
    var startTime: String = ""
    var startDepth: Double = 0.0
    lateinit var endDate: SimpleDate //Date of collection
    var endTime: String = ""
    var endDepth: Double = 0.0
    var submittingEntity: String = ""
    var collectingEntity: String = ""
    var monitoringType: String = "" //Type of data
    var compositeCategory: String = ""
    var compositeType: String = ""
    var paramName: String = ""
    var paramCode: String = ""
    var GTLTvalue: String = ""
    var value: Double = 0.0 //Actual data
    var RFID: String = ""
    var lat: Double = 0.0
    var long: Double = 0.0
    var comment: String = ""
}