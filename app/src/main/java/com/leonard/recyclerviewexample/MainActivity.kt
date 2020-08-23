package com.leonard.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val courseList = ArrayList<Course>()

        courseList.add(Course(1, "Kotlin", 1001, "Mr Wanyama", "A new language for Android"))
        courseList.add(Course(2, "Java", 1002, "Mr Ondiek", "An old language for Android"))
        courseList.add(Course(3, "Python", 1003, "Miss Wainana", "A hyper Language"))
        courseList.add(Course(4, "Swift", 1004, "Mrs Rita", "A hyper Language"))

        /**
         * Add more courses upto Ten
         */

        val adapter = CourseRecyclerViewAdapter(courseList)

        course_recyclerview.layoutManager = LinearLayoutManager(this)
        course_recyclerview.adapter = adapter
    }
}