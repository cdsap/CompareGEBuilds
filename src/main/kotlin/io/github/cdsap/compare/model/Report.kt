package io.github.cdsap.compare.model

data class Report(
    val taskPathReport: Boolean,
    val taskTypeReport: Boolean,
    val kotlinBuildReport: Boolean,
    val processesReport: Boolean,
    val buildReport: Boolean
)