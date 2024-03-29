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

class Login : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("checkFragment1","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("checkFragment1","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("checkFragment1","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("checkFragment1","onViewCreated")
        var signupbtn = view.findViewById<Button>(R.id.button)
        var loginbtn = view.findViewById<Button>(R.id.button2)
        signupbtn.setOnClickListener {
            var name = view.findViewById<EditText>(R.id.username)
            var email = view.findViewById<EditText>(R.id.email)
            val bundle = Bundle()
            bundle.putString("name",name.text.toString())
            bundle.putString("email",email.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_login_to_register,bundle)
        }
        loginbtn.setOnClickListener {
            var name = view.findViewById<EditText>(R.id.username)
            var email = view.findViewById<EditText>(R.id.email)
            val bundle = Bundle()
            bundle.putString("name",name.text.toString())
            bundle.putString("email",email.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_login_to_home2,bundle)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("checkFragment1","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("checkFragment1","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("checkFragment1","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("checkFragment1","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("checkFragment1","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("checkFragment1","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("checkFragment1","onDetach")
    }
}