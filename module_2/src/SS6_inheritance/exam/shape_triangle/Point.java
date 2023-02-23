package SS6_inheritance.exam.shape_triangle;

import java.util.Arrays;

public class Point {
        private float pointX = 0.0f;
        private float pointY =0.0f;

        public Point() {}

        public Point(float pointX, float pointY) {
            this.pointX = pointX;
            this.pointY = pointY;
        }

        public float getPointX() {
            return pointX;
        }

        public void setPointX(float pointX) {
            this.pointX = pointX;
        }

        public float getPointY() {
            return pointY;
        }
        public void setXY(float pointX, float pointY){
            this.pointX = pointX;
            this.pointY = pointY;
        }
        public String getXY(){
            float[] arr = {getPointX(), getPointY()};
            return Arrays.toString(arr);
        }
        public void setPointY(float pointY) {
            this.pointY = pointY;
        }

        @Override
        public String toString() {
            return getXY();
        }
}
