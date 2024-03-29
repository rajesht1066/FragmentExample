package com.example.fragmentexample

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation

class Home : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("checkFragment3","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("checkFragment3","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("checkFragment3","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("checkFragment3","onViewCreated")
        var login = arguments?.getBundle("login")
        var fname = arguments?.getString("fname")
        var lname = arguments?.getString("lname")
        var name = login?.getString("name") ?: arguments?.getString("name")
        var email = login?.getString("email") ?: arguments?.getString("email")
        var fnameview = view.findViewById<TextView>(R.id.textView3)
        var lnameview = view.findViewById<TextView>(R.id.textView4)
        var nameview = view.findViewById<TextView>(R.id.textView5)
        var emailview = view.findViewById<TextView>(R.id.textView6)
//        println(name)
//        println(email)
//        println(fname)
//        println(lname)
        fnameview.text = fname
        lnameview.text = lname
        nameview.text = name
        emailview.text = email
    }

    override fun onStart() {
        super.onStart()
        Log.i("checkFragment3","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("checkFragment3","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("checkFragment3","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("checkFragment3","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("checkFragment3","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("checkFragment3","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("checkFragment3","onDetach")
    }
}