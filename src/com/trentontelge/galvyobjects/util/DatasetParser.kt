package com.trentontelge.galvyobjects.util

import com.trentontelge.galvyobjects.GalvyObjects
import java.io.File
import java.util.*

object DatasetParser {
    private val FILE_BLACK_DUCK_BAY = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/BlackDuckBay.txt").toURI())
    private val FILE_BURNET_BAY = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/BurnetBay.txt").toURI())
    private val FILE_CRYSTAL_BAY = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/CrystalBay.txt").toURI())
    private val FILE_SAN_JACINTO_BAY = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/SanJacintoBay.txt").toURI())
    private val FILE_SCOTT_BAY = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/ScottBay.txt").toURI())
    private val FILE_SHIP_CHANNEL = File(GalvyObjects::class.java.getResource("/com/trentontelge/galvyobjects/datasets/ShipChannel.txt").toURI())

    fun parseSets(vararg sets: Dataset): Vector<DataEntry> {
        val datasets = Vector<File>()
        for (set: Dataset in sets) {
            when (set){
                Dataset.BLACK_DUCK_BAY -> datasets.addElement(FILE_BLACK_DUCK_BAY)
                Dataset.BURNET_BAY -> datasets.addElement(FILE_BURNET_BAY)
                Dataset.CRYSTAL_BAY -> datasets.addElement(FILE_CRYSTAL_BAY)
                Dataset.SAN_JACINTO_BAY -> datasets.addElement(FILE_SAN_JACINTO_BAY)
                Dataset.SCOTT_BAY -> datasets.addElement(FILE_SCOTT_BAY)
                Dataset.SHIP_CHANNEL -> datasets.addElement(FILE_SHIP_CHANNEL)
                Dataset.ALL -> return parseAndReturn(FILE_BLACK_DUCK_BAY, FILE_BURNET_BAY, FILE_CRYSTAL_BAY, FILE_SAN_JACINTO_BAY, FILE_SCOTT_BAY, FILE_SHIP_CHANNEL)
            }
        }
        return parseAndReturn(datasets)
    }
    fun parseAndReturn(vararg files: File): Vector<DataEntry>{
        val arg = Vector<File>()
        for (file: File in files) {
            arg.addElement(file)
        }
        return parseAndReturn(arg)
    }
    fun parseAndReturn(files: Vector<File>): Vector<DataEntry>{
        for (file: File in files) {

        }
    }

}