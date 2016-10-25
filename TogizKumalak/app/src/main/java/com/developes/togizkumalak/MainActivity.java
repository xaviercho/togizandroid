package com.developes.togizkumalak;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public static void playNextCup(Activity activityIn, TextView cupIn, int handFullIn, TextView pt){


        int wt = Integer.parseInt(pt.getText().toString());  //wt ==who's turn
        handFullIn--;
        if (cupIn == activityIn.findViewById(R.id.tvp1c0)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c1);
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");
            if (handFullIn != 0){
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if (((seedCount%2) == 1) && wt==2  ) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score); // player1 score number >> textView14  && 15 is player 2
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }
        } else if (cupIn == activityIn.findViewById(R.id.tvp1c1)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c2);
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp1c2)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c3); /// goes cup 3 to 4
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp1c3)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c4); /// goes cup 4 to 5
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp1c4)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c5); /// goes cup 5 to 6
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }
        //////////////////////////////////////////////player 2 cup transistion!!!!
        else if (cupIn == activityIn.findViewById(R.id.tvp1c5)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c6); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }  else if (cupIn == activityIn.findViewById(R.id.tvp1c6)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c7); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp1c7)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.player2score); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==2) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player2score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }


        //////////////////////////////////////////////////////
        else if (cupIn == activityIn.findViewById(R.id.player2score)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c0); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            }

        }
        //////////////////////////////////////////////////////




        else if (cupIn == activityIn.findViewById(R.id.tvp2c0)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c1); /// goes cup 1 to 2
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp2c1)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c2); /// goes cup 2 to 3
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp2c2)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c3); /// goes cup 3 to 4
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }  else if (cupIn == activityIn.findViewById(R.id.tvp2c3)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c4); /// goes cup 4 to 5
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        } else if (cupIn == activityIn.findViewById(R.id.tvp2c4)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c5); /// goes cup 3 to 4
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }





        else if (cupIn == activityIn.findViewById(R.id.tvp2c5)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c6); /// goes cup 3 to 4
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }  else if (cupIn == activityIn.findViewById(R.id.tvp2c6)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp2c7); /// goes cup 3 to 4
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }







        else if (cupIn == activityIn.findViewById(R.id.tvp2c7)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.player1score); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            } else if ((((seedCount%2) == 1)) && wt==1) {
                TextView capturedCup = (TextView) activityIn.findViewById(R.id.player1score);
                int capturedCount = Integer.parseInt(capturedCup.getText().toString());
                capturedCount += seedCount;
                capturedCup.setText(capturedCount + "");
            }

        }


        //////////////////////////////////////////////////////
        else if (cupIn == activityIn.findViewById(R.id.player1score)) {
            TextView nextCup = (TextView) activityIn.findViewById(R.id.tvp1c0); /// goes cup 6 to 1
            int seedCount = Integer.parseInt(cupIn.getText().toString());
            seedCount++;
            cupIn.setText(seedCount + "");

            if (handFullIn != 0) {
                playNextCup(activityIn, nextCup, handFullIn,pt);
            }

        }
        //////////////////////////////////////////////////////


    }






















    public void sendMessage(View view) {

        Button clickedButton = (Button) view;
        TextView pt = (TextView)findViewById(R.id.turn);
        if (clickedButton == findViewById(R.id.p1c0)){
            TextView cup = (TextView) findViewById(R.id.tvp1c0);
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0){
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c1), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p1c1)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c1);//cup 2  to cup 3
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c2), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p1c2)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c2);  //cup 3  to cup 4
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c3), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p1c3)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c3);  //cup 4  to cup 5
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c4), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p1c4)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c4);  //cup 5  to cup 6
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c5), handFull,pt);
            }
        }




        else if (clickedButton == findViewById(R.id.p1c5)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c5);  //cup 5  to cup 6
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c6), handFull,pt);
            }
        }  else if (clickedButton == findViewById(R.id.p1c6)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c6);  //cup 5  to cup 6
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("2");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp1c7), handFull,pt);
            }
        }

        //////////////////////////////////////////////player 2 cup transistion
        else if (clickedButton == findViewById(R.id.p1c7)) {
            TextView cup = (TextView) findViewById(R.id.tvp1c7);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.player2score), handFull,pt);
            }
        }

        /////////////////////////////////////////////////////////////
        else if (clickedButton == findViewById(R.id.player2score)) {
            TextView cup = (TextView) findViewById(R.id.player2score);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c0), handFull,pt);
            }
        }


        else if (clickedButton == findViewById(R.id.p2c0)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c0);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c1), handFull,pt);
            }
        }
        /////////////////////////////////////////////////////////////


        else if (clickedButton == findViewById(R.id.p2c1)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c1);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c2), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p2c2)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c2);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c3), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p2c3)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c3);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c4), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p2c4)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c4);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c5), handFull,pt);
            }
        } else if (clickedButton == findViewById(R.id.p2c5)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c5);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c6), handFull,pt);
            }
        }

        else if (clickedButton == findViewById(R.id.p2c6)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c6);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c7), handFull,pt);
            }
        }




        else if (clickedButton == findViewById(R.id.p2c7)) {
            TextView cup = (TextView) findViewById(R.id.tvp2c7);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.player1score), handFull,pt);
            }
        }
        else if (clickedButton == findViewById(R.id.player1score)) {
            TextView cup = (TextView) findViewById(R.id.player1score);  //cup 6  to cup 1
            int handFull = Integer.parseInt(cup.getText().toString());
            pt.setText("1");
            if (handFull > 0) {
                cup.setText("0");
                playNextCup(this, (TextView) findViewById(R.id.tvp2c0), handFull,pt);
            }
        }





    }




































}
