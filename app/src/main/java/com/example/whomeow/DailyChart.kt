package com.example.nycy1020.whomeowproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nycy1020.whomeowproject.databinding.ActivityDailyChartBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import com.google.android.material.navigation.NavigationBarView


class DailyChart : AppCompatActivity(){

    lateinit var binding: ActivityDailyChartBinding
    lateinit var barChart: BarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailyChartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //btn for chart activity
        binding.btnWeekly.setOnClickListener {
            startActivity((Intent(this,WeeklyChart::class.java)))
        }
        binding.btnMonthly.setOnClickListener {
            startActivity((Intent(this,MonthlyChart::class.java)))
        }




        barChart = findViewById(R.id.bar_chart)  //barChart 생성

        val list = ArrayList<BarEntry>()
        list.add(BarEntry(1.2f, 80.0f))
        list.add(BarEntry(2.2f, 60.0f))
        list.add(BarEntry(3.2f, 30.0f))
        list.add(BarEntry(4.2f, 20.0f))
        list.add(BarEntry(5.2f, 70.0f))

        barChart.run {
            description.isEnabled = false
            setMaxVisibleValueCount(5)
            setPinchZoom(false)
            setDrawBarShadow(false)
            setDrawBarShadow(false)
            axisLeft.run {
                axisMaximum = 101f
                axisMinimum = 0f
                granularity = 20f // 20마다 선 표시
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
        private val days = arrayOf("행동1", "행동2", "행동3", "행동4", "행동5")
        override fun getAxisLabel(value: Float, axis: AxisBase?): String {
            return days.getOrNull(value.toInt() - 1) ?: value.toString()
        }
    }

}

