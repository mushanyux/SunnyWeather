package com.sunnyweather.android.logic.model

/**
 *@CLassName Weather
 *@Author mushanyu
 *@Date 2025/3/6
 *@Description 分装实时和未来
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)