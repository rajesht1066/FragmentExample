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
import androidx.navigation.Navigation

class Register : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("checkFragment2","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("checkFragment2","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("checkFragment2","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("checkFragment2","onViewCreated")
        var registerbtn = view.findViewById<Button>(R.id.button3)
        registerbtn.setOnClickListener {
            var fname = view.findViewById<EditText>(R.id.editTextText)
            var lname = view.findViewById<EditText>(R.id.editTextText2)
            val bundle = Bundle()
            bundle.putString("fname",fname.text.toString())
            bundle.putString("lname",lname.text.toString())
            bundle.putBundle("login",arguments)
            Navigation.findNavController(view).navigate(R.id.action_register_to_home2,bundle)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("checkFragment2","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("checkFragment2","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("checkFragment2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("checkFragment2","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("checkFragment2","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("checkFragment2","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("checkFragment2","onDetach")
    }
}