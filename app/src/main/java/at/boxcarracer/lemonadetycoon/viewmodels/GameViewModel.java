package at.boxcarracer.lemonadetycoon.viewmodels;

import android.text.TextUtils;
import android.util.Patterns;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import at.boxcarracer.lemonadetycoon.models.GameState;

public class GameViewModel extends BaseObservable
{
    private GameState gameState;

    public GameViewModel()
    {
        this.gameState = new GameState(1000, 0, 0);
    }

    @Bindable
    public int getMoney()
    {
        return gameState.getMoney();
    }

    public void setMoney(int amount)
    {
        gameState.setMoney(amount);
        notifyPropertyChanged(BR.money);

    }
}
