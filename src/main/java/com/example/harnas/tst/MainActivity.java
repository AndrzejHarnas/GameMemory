package com.example.harnas.tst;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageButton;

import java.util.LinkedList;
import java.util.List;




public class MainActivity extends AppCompatActivity {


    public int flagb1 = 0;
    public int flagpic= 0;
    public int [] pic = new int[20];
    public ImageButton[] Ib = new ImageButton[20];


    Button start;

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ib[0] = findViewById(R.id.Ibutton1);
        Ib[1] = findViewById(R.id.Ibutton2);
        Ib[2] = findViewById(R.id.Ibutton3);
        Ib[3] = findViewById(R.id.Ibutton4);
        Ib[4] = findViewById(R.id.Ibutton5);
        Ib[5] = findViewById(R.id.Ibutton6);
        Ib[6] = findViewById(R.id.Ibutton7);
        Ib[7] = findViewById(R.id.Ibutton8);
        Ib[8] = findViewById(R.id.Ibutton9);
        Ib[9] = findViewById(R.id.Ibutton10);
        Ib[10] = findViewById(R.id.Ibutton11);
        Ib[11] = findViewById(R.id.Ibutton12);
        Ib[12] = findViewById(R.id.Ibutton13);
        Ib[13] = findViewById(R.id.Ibutton14);
        Ib[14] = findViewById(R.id.Ibutton15);
        Ib[15] = findViewById(R.id.Ibutton16);
        Ib[16] = findViewById(R.id.Ibutton17);
        Ib[17] = findViewById(R.id.Ibutton18);
        Ib[18] = findViewById(R.id.Ibutton19);
        Ib[19] = findViewById(R.id.Ibutton20);
        start = findViewById(R.id.ButtonStart);

        for (i = 0; i <= 19; i++) {
            Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
        }


        randomClass rand1 = new randomClass(10);
        randomClass rand2 = new randomClass(10);


        for (i = 0; i <= 9; i++) {
            pic[i] = rand1.get();
        }

        for (i = 10; i <= 19; i++) {
            pic[i] = rand2.get();
        }


        Ib[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(0);


            }
        });

        Ib[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(1);


            }
        });

        Ib[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(2);


            }
        });

        Ib[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(3);


            }
        });

        Ib[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(4);


            }
        });


        Ib[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(5);


            }
        });

        Ib[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(6);


            }
        });

        Ib[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(7);


            }
        });

        Ib[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(8);


            }
        });

        Ib[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(9);


            }
        });

        Ib[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(10);


            }
        });

        Ib[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(11);


            }
        });

        Ib[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(12);


            }
        });

        Ib[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(13);


            }
        });

        Ib[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(14);


            }
        });

        Ib[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(15);


            }
        });

        Ib[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(16);


            }
        });

        Ib[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(17);


            }
        });

        Ib[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(18);


            }
        });

        Ib[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                game(19);


            }
        });


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getIntent();
                //Return the intent that started this activity.
                // Get the current activity
                Intent intent = getIntent();

                /*
                    public void finish ()
                        Call this when your activity is done and should be closed. The ActivityResult
                        is propagated back to whoever launched you via onActivityResult().

                */
                // Finish the activity
                finish();

                /*
                    public void startActivity (Intent intent)
                        Same as startActivity(Intent, Bundle) with no options specified.

                    Parameters
                        intent : Intent: The intent to start.
                    Throws
                        android.content.ActivityNotFoundException
                */
                // Restart the activity
                startActivity(intent);


            }
        });

    }

    public void game(int piknumber) {



        if (pic[piknumber] == 1) {
            if (flagb1 == 0) {
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                Ib[piknumber].setBackgroundResource(R.drawable.konik);

                flagpic =piknumber;

                flagb1 = 1;

            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {



                    Ib[piknumber].setBackgroundResource(R.drawable.konik);
                    Ib[piknumber].refreshDrawableState();
                //        try{
                //        Thread.sleep(1000);
                //    } catch (InterruptedException e){ }
                //    Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                //    Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }


            }

        }


        if (pic[piknumber] == 2) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.kotek);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {



                    Ib[piknumber].setBackgroundResource(R.drawable.kotek);
                    Ib[piknumber].refreshDrawableState();
                  //  try{
                  //         Thread.sleep(1000);
                  //     } catch (InterruptedException e){ }
                  //   Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //   Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;

                }


            }

        }

        if (pic[piknumber] == 3) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.krolik);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.krolik);
                    Ib[piknumber].refreshDrawableState();
                  //  try {
                  //      Thread.sleep(1000);
                  //  } catch (InterruptedException e){ }
                  //  Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //  Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }



            }

        }

        if (pic[piknumber] == 4) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.krowa);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.krowa);
                    Ib[piknumber].refreshDrawableState();
                  //  try {
                  //      Thread.sleep(1000);
                  //  } catch (InterruptedException e){ }
                  //  Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //  Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }

            }

        }

        if (pic[piknumber] == 5) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.myszka);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.myszka);
                    Ib[piknumber].refreshDrawableState();
                  //  try {
                  //      Thread.sleep(1000);
                  //  } catch (InterruptedException e){ }
                  //  Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //  Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }

            }

        }

        if (pic[piknumber] == 6) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.niedzwiedz);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.niedzwiedz);
                    Ib[piknumber].refreshDrawableState();
                  //  try {
                  //      Thread.sleep(1000);
                  //  } catch (InterruptedException e){ }
                  //  Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //  Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }


            }

        }

        if (pic[piknumber] == 7) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.pajak);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.pajak);
                    Ib[piknumber].refreshDrawableState();
                  //  try {
                  //      Thread.sleep(1000);
                  //  } catch (InterruptedException e){ }
                  //  Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                  //  Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }


            }

        }

        if (pic[piknumber] == 8) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.piesek);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.piesek);
                    Ib[piknumber].refreshDrawableState();
                 //   try {
                 //       Thread.sleep(1000);
                 //   } catch (InterruptedException e){ }
                 //   Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                 //   Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }


            }

        }

        if (pic[piknumber] == 9) {


            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.sowa);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.sowa);
                    Ib[piknumber].refreshDrawableState();
                 //   try {
                 //       Thread.sleep(1000);
                 //   } catch (InterruptedException e){ }
                 //   Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                 //   Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;
                }


            }

        }
        if (pic[piknumber] == 10) {

            if (flagb1 == 0) {
                flagpic =piknumber;
                for (i = 0; i <= 19; i++) {
                    Ib[i].setBackgroundResource(R.drawable.ic_launcher_background);
                }
                flagb1 = 1;
                Ib[piknumber].setBackgroundResource(R.drawable.zaba);
            } else {

                if(pic[piknumber]==pic[flagpic]){
                    if(flagpic!=piknumber) {
                        Ib[piknumber].setVisibility(View.INVISIBLE);
                        Ib[flagpic].setVisibility(View.INVISIBLE);
                        flagb1 = 0;
                    }
                } else {

                    Ib[piknumber].setBackgroundResource(R.drawable.zaba);
                    Ib[piknumber].refreshDrawableState();
                 //      try {
                 //      Thread.sleep(1000);
                 //   } catch (InterruptedException e){ }
                 //   Ib[flagpic].setBackgroundResource(R.drawable.ic_launcher_background);
                 //   Ib[piknumber].setBackgroundResource(R.drawable.ic_launcher_background);
                    flagb1 = 0;

                }


            }

        }





    }

}




 class randomClass {

    private List<Integer> numbers;

    private Integer size;

     public void init() {

         numbers = new LinkedList<Integer>();

         for (int i = 1; i < this.getSize() + 1; i++) {
             numbers.add(new Integer(i));
         }
     }


     public Integer get() {
         Integer i = (int) (Math.random() * size);
         i = numbers.get(i);
         numbers.remove(i);
         this.size = numbers.size();
         return i;
     }


     private Integer getSize() {
         return size;
     }

public randomClass(int size){
         this.size = size;
         init();
}
}

