package com.example.joelbuhrman.tentaplugg;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
public class FysikExtentor extends Activity implements View.OnTouchListener {
    private static final String TAG = "Touch";
    private static final float MIN_ZOOM = 1f, MAX_ZOOM = 1f;
    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;
    PointF start = new PointF();
    PointF mid = new PointF();
    float oldDist = 1f;


    private  ArrayList<String> Party_list_new2 = new ArrayList<String>();


    private boolean[] choosenQuestions = {true, true, true, true, true, true};

    private int[] q1 = new int[]{R.drawable.f13q1, R.drawable.f14q1, R.drawable.f15q1, R.drawable.f12q1};
    private int[] q2 = new int[]{R.drawable.f13q2, R.drawable.f14q2, R.drawable.f15q2, R.drawable.f12q2};
    private int[] q3 = new int[]{R.drawable.f13q3, R.drawable.f14q3, R.drawable.f15q3, R.drawable.f12q3};
    private int[] q4 = new int[]{R.drawable.f13q4, R.drawable.f14q4, R.drawable.f15q4, R.drawable.f12q4};
    private int[] q5 = new int[]{R.drawable.f13q5, R.drawable.f14q5, R.drawable.f15q5, R.drawable.f12q5};
    private int[] q6 = new int[]{R.drawable.f13q6, R.drawable.f14q6, R.drawable.f15q6, R.drawable.f12q6};

    private int[] a1 = new int[]{R.drawable.f13a1, R.drawable.f14a1, R.drawable.f15a1, R.drawable.f12a1};
    private int[] a2 = new int[]{R.drawable.f13a2, R.drawable.f14a2, R.drawable.f15a2, R.drawable.f12a2};
    private int[] a3 = new int[]{R.drawable.f13a3, R.drawable.f14a3, R.drawable.f15a3, R.drawable.f12a3};
    private int[] a4 = new int[]{R.drawable.f13a4, R.drawable.f14a4, R.drawable.f15a4, R.drawable.f12a4};
    private int[] a5 = new int[]{R.drawable.f13a5, R.drawable.f14a5, R.drawable.f15a5, R.drawable.f12a5};
    private int[] a6 = new int[]{R.drawable.f13a6, R.drawable.f14a6, R.drawable.f15a6, R.drawable.f12a6};

    private ArrayList<Integer> answers;
    private ArrayList<Integer> questions;
    private ArrayList<int[]> qLists, aLists;

    private ImageView question, answer;
    Random rand;
    private int index, ansResource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extentor);
        questions = new ArrayList<Integer>();
        answers = new ArrayList<Integer>();

        Party_list_new2.add("1");
        Party_list_new2.add("2");
        Party_list_new2.add("3");
        Party_list_new2.add("4");
        Party_list_new2.add("5");
        Party_list_new2.add("6");


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


        rand = new Random();
        question = (ImageView) findViewById(R.id.matstat_extentor_question_imageView);
        answer = (ImageView) findViewById(R.id.matstat_extentor_answer_imageView);
        question.setOnTouchListener(this);
        answer.setOnTouchListener(this);
        filter(choosenQuestions);


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
        setResources();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for(boolean b: filtered){
            if(b){
                sb.append(i+ ", ");
            }
            i++;
        }
        sb.replace(sb.length()-2, sb.length(), ".");
        Toast.makeText(this, "Showing questions: "+sb.toString(), Toast.LENGTH_SHORT).show();

    }

    public void setResources(){
        index = rand.nextInt(questions.size());
        ansResource = answers.get(index);
        question.setImageResource(questions.get(index));
        answer.setImageResource(R.color.blank);
        questions.remove(index);
        answers.remove(index);
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
                Party_list_new2));

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
                boolean correct = false;
                for (int k = 0; k < Party_list_new2.size(); k++) {
                    if (positions.get(k)) {

                        temp[k] = true;
                        correct = true;

                    } else {
                        temp[k] = false;
                    }
                }

                if (correct) {
                    filter(temp);
                    dia.dismiss();
                }

            }
        });
        dia.show();

    }


    /**
     * Metod hämtad från nätet för zoomade bilder
     *
     * @param v
     * @param event
     * @return
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        ImageView view = (ImageView) v;
        view.setScaleType(ImageView.ScaleType.MATRIX);
        float scale;

        dumpEvent(event);
        // Handle touch events here...

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:   // first finger down only
                savedMatrix.set(matrix);
                start.set(event.getX(), event.getY());
                Log.d(TAG, "mode=DRAG"); // write to LogCat
                mode = DRAG;
                break;

            case MotionEvent.ACTION_UP: // first finger lifted

            case MotionEvent.ACTION_POINTER_UP: // second finger lifted

                mode = NONE;
                Log.d(TAG, "mode=NONE");
                break;

            case MotionEvent.ACTION_POINTER_DOWN: // first and second finger down

                oldDist = spacing(event);
                Log.d(TAG, "oldDist=" + oldDist);
                if (oldDist > 5f) {
                    savedMatrix.set(matrix);
                    midPoint(mid, event);
                    mode = ZOOM;
                    Log.d(TAG, "mode=ZOOM");
                }
                break;

            case MotionEvent.ACTION_MOVE:

                if (mode == DRAG) {
                    matrix.set(savedMatrix);
                    matrix.postTranslate(event.getX() - start.x, event.getY() - start.y); // create the transformation in the matrix  of points
                } else if (mode == ZOOM) {
                    // pinch zooming
                    float newDist = spacing(event);
                    Log.d(TAG, "newDist=" + newDist);
                    if (newDist > 5f) {
                        matrix.set(savedMatrix);
                        scale = newDist / oldDist; // setting the scaling of the
                        // matrix...if scale > 1 means
                        // zoom in...if scale < 1 means
                        // zoom out
                        matrix.postScale(scale, scale, mid.x, mid.y);
                    }
                }
                break;
        }

        view.setImageMatrix(matrix); // display the transformation on screen

        return true; // indicate event was handled
    }

    private float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float) Math.sqrt(x * x + y * y);
    }

    /*
     * --------------------------------------------------------------------------
     * Method: midPoint Parameters: PointF object, MotionEvent Returns: void
     * Description: calculates the midpoint between the two fingers
     * ------------------------------------------------------------
     */

    private void midPoint(PointF point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.set(x / 2, y / 2);
    }

    /**
     * Show an event in the LogCat view, for debugging
     */
    private void dumpEvent(MotionEvent event) {
        String names[] = {"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"};
        StringBuilder sb = new StringBuilder();
        int action = event.getAction();
        int actionCode = action & MotionEvent.ACTION_MASK;
        sb.append("event ACTION_").append(names[actionCode]);

        if (actionCode == MotionEvent.ACTION_POINTER_DOWN || actionCode == MotionEvent.ACTION_POINTER_UP) {
            sb.append("(pid ").append(action >> MotionEvent.ACTION_POINTER_ID_SHIFT);
            sb.append(")");
        }

        sb.append("[");
        for (int i = 0; i < event.getPointerCount(); i++) {
            sb.append("#").append(i);
            sb.append("(pid ").append(event.getPointerId(i));
            sb.append(")=").append((int) event.getX(i));
            sb.append(",").append((int) event.getY(i));
            if (i + 1 < event.getPointerCount())
                sb.append(";");
        }

        sb.append("]");
        Log.d("Touch Events ---------", sb.toString());
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
