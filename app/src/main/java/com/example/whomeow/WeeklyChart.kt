package com.example.whomeow

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whomeow.databinding.ActivityWeeklyChartBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.utils.ColorTemplate

class WeeklyChart : AppCompatActivity() {
    private lateinit var binding: ActivityWeeklyChartBinding
    private lateinit var barChart: BarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeeklyChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCardEditProfile.setOnClickListener {
            startActivity((Intent(this,EditProfile::class.java)))
        }


        binding.btnWeektomon.setOnClickListener {
            startActivity((Intent(this,MonthlyChart::class.java)))
        }
        binding.btnWeektoday.setOnClickListener {
            startActivity((Intent(this, DailyChart::class.java)))
        }




        barChart = findViewById(R.id.bar_chart)  //barChart 생성
        val list = ArrayList<BarEntry>()
        list.add(BarEntry(1.2f, 3.0f))
        list.add(BarEntry(2.2f, 14.0f))
        list.add(BarEntry(3.2f, 13.0f))


        barChart.run {
            description.isEnabled = false
            setMaxVisibleValueCount(3)
            axisLeft.run {
                axisMaximum = 15f
                axisMinimum = 0f
                granularity = 3f // 3마다 선 표시
                setDrawLabels(true) //값 표시
                setDrawGridLines(true) //격자 표시
                setDrawAxisLine(false) //y축
                textSize = 13f
            }
            xAxis.run {
                position = XAxis.XAxisPosition.BOTTOM
                granularity = 1f // 1 단위만큼 간격 두기
                setDrawAxisLine(true)
                setDrawGridLines(false) // 격자
                textSize = 12f
                valueFormatter = MyXAxisFormatter()
            }
            axisRight.isEnabled = false
            setTouchEnabled(false)
            animateY(1000) // 밑에서부터 올라오는 애니메이션 적용
            legend.isEnabled = false //차트 범례 설정


        }
        val barDataSet = BarDataSet(list, "List")
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 255)
        barDataSet.valueTextColor = Color.BLACK
        val barData = BarData(barDataSet)
        barData.barWidth = 0.5f //막대 너비 설정
        barChart.setFitBars(true)
        barChart.data = barData
    }
    inner class MyXAxisFormatter : ValueFormatter() {
        private val behaviors = arrayOf("scratch", "turn", "feetup")
        override fun getAxisLabel(value: Float, axis: AxisBase?): String {
            return behaviors.getOrNull(value.toInt() - 1) ?: value.toString()
        }
    }
}