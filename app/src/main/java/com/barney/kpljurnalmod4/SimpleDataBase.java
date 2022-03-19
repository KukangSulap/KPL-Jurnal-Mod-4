package com.barney.kpljurnalmod4;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class SimpleDataBase <T> {

   List<T> storedData;
   List<Date> inputDates;
   TextView antiprivatetxt;

   public SimpleDataBase(TextView qq) {
      this.storedData = new ArrayList<T>();
      this.inputDates = new ArrayList<Date>();
      antiprivatetxt = qq;
   }

   void AddNewData(T qq){
      Date now = new Date();
      storedData.add(qq);
      inputDates.add(now);
   }

   void PrintAllData(){
      String holder = "";

      for (int i = 0; i < storedData.size(); i++) {
         holder += ("Data "+(i+1)+" berisi: "+ storedData.get(i)
                 +", yang disimpan pada waktu UTC: "+ inputDates.get(i) + "\n");
      }

      antiprivatetxt.setText(holder);
   }

}
