package com.example.joelbuhrman.tentaplugg;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JoelBuhrman on 2015-12-09.
 */
public class FysikExtentor extends Activity {

    public static ArrayList<String> Party_list_new = new ArrayList<String>();

    ArrayList<String> party_multi_cheked = new ArrayList<String>();


    private boolean[] choosenQuestions = {true, true, true, true, true, true, true};

    private int[] q1 = new int[]{R.drawable.f13q1, R.drawable.f14q1,R.drawable.f15q1,R.drawable.f12q1};
    private int[] q2 = new int[]{R.drawable.f13q2, R.drawable.f14q2,R.drawable.f15q2,R.drawable.f12q2};
    private int[] q3 = new int[]{R.drawable.f13q3, R.drawable.f14q3,R.drawable.f15q3,R.drawable.f12q3};
    private int[] q4 = new int[]{R.drawable.f13q4, R.drawable.f14q4,R.drawable.f15q4,R.drawable.f12q4};
    private int[] q5 = new int[]{R.drawable.f13q5, R.drawable.f14q5,R.drawable.f15q5,R.drawable.f12q5};
    private int[] q6 = new int[]{R.drawable.f13q6, R.drawable.f14q6,R.drawable.f15q6,R.drawable.f12q6};

    private int[] a1 = new int[]{R.drawable.f13a1, R.drawable.f14a1,R.drawable.f15a1,R.drawable.f12a1};
    private int[] a2 = new int[]{R.drawable.f13a2, R.drawable.f14a2,R.drawable.f15a2,R.drawable.f12a2};
    private int[] a3 = new int[]{R.drawable.f13a3, R.drawable.f14a3,R.drawable.f15a3,R.drawable.f12a3};
    private int[] a4 = new int[]{R.drawable.f13a4, R.drawable.f14a4,R.drawable.f15a4,R.drawable.f12a4};
    private int[] a5 = new int[]{R.drawable.f13a5, R.drawable.f14a5,R.drawable.f15a5,R.drawable.f12a5};
    private int[] a6 = new int[]{R.drawable.f13a6, R.drawable.f14a6,R.drawable.f15a6,R.drawable.f12a6};

    private ArrayList<Integer> answers;
    private ArrayList<Integer> questions;
    private ArrayList<int[]> qLists, aLists;

    private ImageView question, answer;
    Random rand;
    private int index, ansResource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fysik_extentor);
        questions = new ArrayList<Integer>();
        answers = new ArrayList<Integer>();

        Party_list_new.add("1");
        Party_list_new.add("2");
        Party_list_new.add("3");
        Party_list_new.add("4");
        Party_list_new.add("5");
        Party_list_new.add("6");


        qLists = new ArrayList<int[]>();
        qLists.add(q1);
        qLists.add(q2);
        qLists.add(q3);
        qLists.add(q4);
        qLists.add(q5);
        qLists.add(q6);

        aLists = new ArrayList<int[]>();
        aLists.add(a1);
        aLists.add(a2);
        aLists.add(a3);
        aLists.add(a4);
        aLists.add(a5);
        aLists.add(a6);


        filter(choosenQuestions);

        question = (ImageView) findViewById(R.id.matstat_extentor_question_imageView);
        answer = (ImageView) findViewById(R.id.matstat_extentor_answer_imageView);

        rand = new Random();

        index = rand.nextInt(questions.size());
        ansResource = answers.get(index);
        question.setImageResource(questions.get(index));
        answer.setImageResource(R.color.blank);


    }


    public void showAnswer(View view) {

        answer.setImageResource(ansResource);

    }

    public void showNextQuestion(View view) {

        if (questions.size() == 0) {
            Toast.makeText(this, "No more questions", Toast.LENGTH_SHORT).show();
        } else {

            index = rand.nextInt(questions.size());


            ansResource = answers.get(index);

            question.setImageResource(questions.get(index));
            answer.setImageResource(R.color.blank);

            questions.remove(index);
            answers.remove(index);

        }
    }

    public void filter(boolean[] filtered) {
        if (questions.size() != 0) {
            questions.clear();
            answers.clear();
            System.out.println(questions.size());
        }


        if (filtered[0]) {

            int[] tempList = qLists.get(0);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(0);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }

        if (filtered[1]) {

            int[] tempList = qLists.get(1);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(1);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }

        if (filtered[2]) {


            int[] tempList = qLists.get(2);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(2);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }

        if (filtered[3])

        {

            int[] tempList = qLists.get(3);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(3);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }

        if (filtered[4])

        {


            int[] tempList = qLists.get(4);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(4);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }

        if (filtered[5])

        {

            int[] tempList = qLists.get(5);
            for (int j = 0; j <= tempList.length - 1; j++) {
                questions.add(tempList[j]);

            }
            int[] tempList2 = aLists.get(5);
            for (int j = 0; j <= tempList.length - 1; j++) {
                answers.add(tempList2[j]);

            }
        }
    }

    public void show_alert(View view) {

        final Dialog dia = new Dialog(this);
        dia.setContentView(R.layout.alert_list);
        dia.setTitle("Välj frågor");
        dia.setCancelable(true);

        final ListView list_alert = (ListView) dia
                .findViewById(R.id.alert_list);

        list_alert.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_multiple_choice,
                Party_list_new));

        list_alert.setItemsCanFocus(false);
        list_alert.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list_alert.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
                                    long arg3) {

            }
        });

        Button btn = (Button) dia.findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                SparseBooleanArray positions = list_alert
                        .getCheckedItemPositions();
                int j = 0;
                boolean[] temp = new boolean[6];
                for (int k = 0; k < Party_list_new.size(); k++) {
                    if (positions.get(k)) {

                        temp[k] = true;


                    } else {
                        temp[k] = false;
                    }
                }
                filter(temp);
                dia.dismiss();

            }
        });
        dia.show();

    }

}
