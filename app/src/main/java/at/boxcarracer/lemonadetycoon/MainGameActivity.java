package at.boxcarracer.lemonadetycoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.BindingAdapter;
import at.boxcarracer.lemonadetycoon.databinding.ActivityMainGameBinding;
import at.boxcarracer.lemonadetycoon.viewmodels.GameViewModel;

import android.os.Bundle;

public class MainGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_game);

        ActivityMainGameBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_game);
        binding.setViewModel(new GameViewModel());
        binding.executePendingBindings();
    }
}