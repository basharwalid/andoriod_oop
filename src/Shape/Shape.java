package Shape;

 abstract public class Shape {

        protected String color;
     Shape(){
         color = "null";
     }

     Shape(String color){
         this.color = color.isEmpty()?"None":color;
     }
        public abstract double getArea();
        public String toString(){
            return "Color of the Shape : "+color;
        };
}
