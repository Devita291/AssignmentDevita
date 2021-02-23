package com.example.assignmentdevita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random_class;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button high_button = (Button) findViewById(R.id.Login_id);
            Button low_button = (Button) findViewById(R.id.Sign_up);
            TextView win_loose = (TextView) findViewById(R.id.BlankResult);
            ImageView user_dice= (ImageView) findViewById(R.id.Img1);
            ImageView computer_dice = (ImageView) findViewById(R.id.Img2);
            random_class = new Random();
            high_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int random_user = create_random();
                    int random_comp = create_random();
                    if(random_user == random_comp){
                        win_loose.setText("Its a Tie!");
                    }
                    else if(random_user > random_comp){
                        win_loose.setText("User WIN!");
                    }
                    else {
                        win_loose.setText("Computer Win!");
                    }

                    switch (random_user){
                        case 1:
                            user_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            user_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            user_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            user_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            user_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            user_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (random_comp){
                        case 1:
                            computer_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            computer_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            computer_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            computer_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            computer_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            computer_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
            });
            low_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int user_random = create_random();
                    int computer_random = create_random();
                    if(user_random == computer_random){
                        win_loose.setText("Its a Tie!");
                    }
                    else if(user_random < computer_random){
                        win_loose.setText("User WIN!");
                    }
                    else {
                        win_loose.setText("Computer Win!");
                    }

                    switch (user_random){
                        case 1:
                            user_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            user_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            user_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            user_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            user_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            user_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (computer_random){
                        case 1:
                            computer_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            computer_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            computer_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            computer_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            computer_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            computer_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
            });
        }

        public int create_random(){
            return  random_class.nextInt(6) + 1;
        }
    }