package com.example.vaishnavi.jobshedulerkotlin

import android.content.ComponentName
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.KeyEventDispatcher
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit private var anyConnectivityRadioButton: RadioButton
    lateinit private var deadlineEditText: EditText
    lateinit private var delayEditText: EditText
    lateinit private var durationTimeEditText: EditText
    lateinit private var requiresChargingCheckBox: CheckBox
    lateinit private var requiresIdleCheckbox: CheckBox
    lateinit private var wiFiConnectivityRadioButton: RadioButton

    lateinit var handler : IncomingMessageHandler
    lateinit var serviceComponent : ComponentName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        anyConnectivityRadioButton = findViewById(R.id.checkbox_any)
        deadlineEditText = findViewById(R.id.deadline_time)
        delayEditText = findViewById(R.id.delay_time)
        durationTimeEditText = findViewById(R.id.duration_time)
        requiresChargingCheckBox = findViewById(R.id.checkbox_charging)
        requiresIdleCheckbox = findViewById(R.id.checkbox_idle)
        wiFiConnectivityRadioButton = findViewById(R.id.checkbox_unmetered)

        handler = IncomingMessageHandler(this)
        serviceComponent = ComponentName(this, MyJobService::class.java)

    }
}
