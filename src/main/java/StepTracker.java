import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private ArrayList<Integer> data = new ArrayList<Integer>();
 private int minSteps;
 public StepTracker(int n){
  minSteps = n;
 }
 public void addDailySteps(int n){
  data.add(n);
 }
 public int activeDays(){
  int count = 0;
  for(int i = 0; i<data.size(); i++){
   if(data.get(i) >= minSteps){
    count++;
   }
  }
  return count;
 }
 public double averageSteps(){
  double sum = 0;
  if(data.size()==0){
   return 0.0;
  }
  for(int i = 0; i<data.size(); i++){
   sum+=data.get(i);
  }
  return sum/data.size();
 }
} 
