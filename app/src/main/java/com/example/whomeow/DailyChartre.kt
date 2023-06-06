package com.example.nycy1020.whomeowproject
/*
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.telecom.Call
import android.text.method.TextKeyListener.clear
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.nycy1020.whomeowproject.databinding.ActivityDailyChartBinding
import com.example.nycy1020.whomeowproject.retrofit.*
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.security.auth.callback.Callback


class DailyChart : AppCompatActivity() {

    lateinit var binding: ActivityDailyChartBinding
    lateinit var barChart: BarChart


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailyChartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //btn for chart activity
        binding.btnWeekly.setOnClickListener {
            startActivity((Intent(this, WeeklyChart::class.java)))
        }
        binding.btnMonthly.setOnClickListener {
            startActivity((Intent(this, MonthlyChart::class.java)))
        }




        //retrofit


        val retrofit = Retrofit.Builder()
            .baseUrl("/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(ApiService::class.java)



        service.getDataList().enqueue(object : Callback<ArrayList<TheDataItem>> {
            override fun onResponse(
                call: Call<ArrayList<TheDataItem>>,
                response: Response<ArrayList<TheDataItem>>
            ) {
                if (response.isSuccessful) {
                    val chartDataList = response.body()



                    val labels = ArrayList<String>()
                    val entries = ArrayList<BarEntry>()

                    if (chartDataList != null) {
                        for (index in chartDataList.indices) {
                            val data = chartDataList[index]
                            val entry = BarEntry(index.toFloat(), data.frequency)
                            entries.add(entry)
                            labels.add(data.behaviors)
                        }
                    }



                    val barDataSet = BarDataSet(entries, "Chart")
                    val barData = BarData(barDataSet)

                    barChart= findViewById(R.id.bar_chart)
                    barChart.data = barData
                    barChart.xAxis.valueFormatter = IndexAxisValueFormatter(labels)




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
                            //granularity = 1f // 1f 단위만큼 간격 두기
                            setDrawAxisLine(true)
                            setDrawGridLines(false) // 격자
                            textSize = 12f
                        }
                        axisRight.isEnabled = false
                        setTouchEnabled(false)
                        animateY(1000) // 밑에서부터 올라오는 애니메이션
                        legend.isEnabled = false //차트 범례 설정

                    }



                    barDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 255)
                    barDataSet.valueTextColor = Color.BLACK
                    barData.barWidth = 0.5f //막대 너비 설정
                    barChart.setFitBars(true)
                    barChart.data = barData

                    barChart.invalidate()

                }

            }

            override fun onFailure(call: Call<ArrayList<TheDataItem>>, t: Throwable) {
                call.cancel()
            }
        })

    }


}
*/