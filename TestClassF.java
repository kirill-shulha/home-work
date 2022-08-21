public class TestClassF {
    public static void main(String[] args) {
        Triangle_F t = new Triangle_F(5, 5, 5) {
            @Override
            public int getPerimeter() {
                return 0;
            }

            @Override
            public int getPerimetr() {
                return 0;
            }

            Rectangle r;

            {
                r = new Rectangle(8, 3) {
                    @Override
                    public int getPerimeter() {
                        return 0;
                    }

                    @Override
                    public int getPerimetr() {
                        return 0;
                    }

                    Circle c = new Circle(2) {
                        @Override
                        public int getPerimetr() {
                            return 0;
                        }

                        @Override
                        public int getSquare() {
                            return 0;
                        }

                        @Override
                    };

                    public int getPerimeter() {
                        return 0;
                    }

                    @Override
                    public int getSquare() {
                        return 0;
                    }

                }
            }
        }
    }