package com.example.kompetentsia
import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.size
import com.example.kompetentsia.databinding.ActivityMain2Binding
import com.example.kompetentsia.databinding.ActivityMainBinding
import com.example.kompetentsia.databinding.OknoBinding
import kotlinx.coroutines.MainScope

class MainActivity : AppCompatActivity() {

    val scope = MainScope()
    private lateinit var binding: ActivityMainBinding
    private lateinit var okno: OknoBinding
    private lateinit var binding2: ActivityMain2Binding
    @SuppressLint("ResourceType", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        okno = OknoBinding.inflate(layoutInflater)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
                val builder = AlertDialog.Builder(this@MainActivity)
            val okno1 = layoutInflater.inflate(R.layout.okno, null)

                builder.setView(okno1)
                val dialog = builder.show()

            dialog.findViewById<AppCompatButton>(R.id.apply)?.setOnClickListener {

                tip = dialog.findViewById<Spinner>(R.id.spinner)?.selectedItem.toString()

                min = dialog.findViewById<EditText>(R.id.minuti)?.text.toString()
                hour = dialog.findViewById<EditText>(R.id.chasi)?.text.toString()
                day = dialog.findViewById<EditText>(R.id.day_text)?.text.toString()
                month = dialog.findViewById<EditText>(R.id.mesats)?.text.toString()
                year =  dialog.findViewById<EditText>(R.id.god)?.text.toString()

                min_dl = dialog.findViewById<EditText>(R.id.minuti_dl)?.text.toString()

                comm = dialog.findViewById<EditText>(R.id.koment)?.text.toString()

                val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

                val rowView: View = inflater.inflate(R.layout.activity_main2, null)
                binding.line!!.addView(rowView, binding.line!!.childCount)

                rowView.findViewById<TextView>(R.id.date_i).text = "$day.$month.$year"
                rowView.findViewById<TextView>(R.id.time_i).text = "$min:$hour"
                rowView.findViewById<TextView>(R.id.time_dl_i).text = "$min_dl"
                rowView.findViewById<TextView>(R.id.tip_i).text = "$tip"
                rowView.findViewById<TextView>(R.id.kom_i).text = "$comm"



                rowView.findViewById<AppCompatButton>(R.id.delete).setOnClickListener {
                    binding.line!!.removeView(rowView as View)
                }





            }


        }



        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.activity_main2, null)

        var superlist = listOf<LinearLayout>(binding.line)
        }

    }
