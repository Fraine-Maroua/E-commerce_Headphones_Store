package ma.projet.headphones.Activity;

import static java.util.ResourceBundle.getBundle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ma.projet.headphones.Domain.Popular;
import ma.projet.headphones.Domain.ManagementCart;
import ma.projet.headphones.R;

public class ShowDetailActivity extends AppCompatActivity {
    private TextView addToCartBtn;
    private TextView titleTxt, feeTxt, descriptionTxt, numberOrderText;
    private ImageView plusBtn, minusBtn, picFood;
    private Popular object;
    int numberOrder = 1;
    private ManagementCart managementCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);


        managementCart = new ManagementCart(this);


    }

  /*  private void getBundle() {

    }
        object= (Popular) getIntent().getSerializableExtra("popular");
        int drawableResourceId=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
                Glide.with(this)
              .load(drawableResourceId)
              .into(picFood);
       titleTxt.setText(object.getTitle());
   feeTxt.setText("$"+object.getFee());
        descriptionTxt.setText(object.getDescription());
        numberOrderText.setText(String.valueOf(numberOrder));



        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOrder=numberOrder+1;
                numberOrderText.setText(String.valueOf(numberOrder));

            }
        });


       minusBtn.setOnClickListener(new View.OnClickListener() {
           @Override
        //  public void onClick(View Object view;
       // view) {
               if (numberOrder>1){
                   numberOrder=numberOrder-1;
//
//                }
//                numberOrderText.setText(String.valueOf(numberOrder));
//            }
//        });
//
//        addToCartBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//           //     object, object.setNumberInCart();
//                managementCart.insertFood(object);
//            }
//        });

    }
*/
    private void initView() {
        addToCartBtn=findViewById(R.id.addToCartBtn);
        titleTxt=findViewById(R.id.titleTxt);
        feeTxt=findViewById(R.id.fee);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        numberOrderText=findViewById(R.id.numberOrderTxt);
        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minusBtn);

    }
}

