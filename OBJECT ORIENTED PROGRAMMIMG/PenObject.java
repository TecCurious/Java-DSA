public class PenObject{
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("red");
        System.out.println(p1.getcolor());
        p1.seteTip(5);
        System.out.println(p1.getTip());
      p1.setColor("yellow");
        System.out.println(p1.getcolor()
        );
    }
}

class Pen {
  private  String color;//color of thr pen
   private int tip;// thickness of the pen
//getters functionas
String getcolor(){
    return this.color;
}

int getTip(){
    return this.tip;
}
    // function for change the color
    void setColor(String newColor){
        color = newColor;
    }

// function for change thikness
void seteTip(int newTip){
    tip = newTip;
}
}