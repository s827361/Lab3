package eecs1022.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab3Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view=findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }
    private String getInputOfTextField(int id){
        View view =findViewById(id);
        EditText editText = (EditText) view;
        String input =editText.getText().toString();
        return input;

    }
    private String getItemSelected(int id){
        View view =findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;

    }
    public void clicked (View view){
        String player1 = getInputOfTextField(R.id.editText);
        String player2 = getInputOfTextField(R.id.editText2);
        String player1action = getItemSelected(R.id.spinner);
        String player2action = getItemSelected(R.id.spinner2);
        int round = 0;

        Game result = new Game(player1,player2,player1action,player2action,round);
        setContentsOfTextView(R.id.lableAnswer, result.toString());






    }
    public void clicked2 (View view){
        String player1 = getInputOfTextField(R.id.editText);
        String player2 = getInputOfTextField(R.id.editText2);
        String player1action = getItemSelected(R.id.spinner3);
        String player2action = getItemSelected(R.id.spinner4);
        int round = 1;

        Game result = new Game(player1,player2,player1action,player2action,round);
        setContentsOfTextView(R.id.lableAnswer, result.toString());




    }
    public void clicked3 (View view){
        String player1 = getInputOfTextField(R.id.editText);
        String player2 = getInputOfTextField(R.id.editText2);
        String player1action = getItemSelected(R.id.spinner5);
        String player2action = getItemSelected(R.id.spinner6);
        int round = 2;

        Game result = new Game(player1,player2,player1action,player2action,round);
        setContentsOfTextView(R.id.lableAnswer, result.toString());


    }









    public void tclicked(View view){
        setContentsOfTextView(R.id.lableAnswer, "New game started, Enter Names of Players");
    }
}
