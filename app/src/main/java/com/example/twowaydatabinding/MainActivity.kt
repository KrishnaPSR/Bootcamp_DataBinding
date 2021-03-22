package com.example.twowaydatabinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.twowaydatabinding.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        binding.user = UserModel("Krishna", "Pratap","rps@gmail.com")
        binding.author=UserModel("Kamal","Singh","ks@gmail.com")
    }

}