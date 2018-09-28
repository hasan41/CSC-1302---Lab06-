
public class ColoredCircle extends Circle implements Colored{
		private String color;
		
		public ColoredCircle(int a, int b, int radius, String color) {
			super(a, b, radius); //center, center and radius
			this.color = color; // String
		}
		public String getColor() {
			return color; //String which is declared in the ColoredCircle Constructor
		}
		public String toString() {
			return super.toString() + "," + color;
		}
		
		public boolean equals(Object o) {
			  if (o instanceof ColoredCircle) {
				  ColoredCircle other = (ColoredCircle) o;
		            return (this.getX() == other.getX() && this.getY() == other.getY()) && this.color.equals(other.color);
		        }
		        else {
		            return false;
		        }
		}

	}

