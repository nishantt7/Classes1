public class Calculator
{
        private double firsttNumber;
        private double secondNumber;
        public double getFirstNumber()
        {
            return this.firsttNumber;
        }
        public double getSecondNumber()
        {
            return this.secondNumber;
        }
        public void setFirstNumber(double firsttNumber)
        {
            this.firsttNumber=firsttNumber;
        }
        public void setSecondNumber(double secondNumber)
        {
            this.secondNumber=secondNumber;
        }
        public double getAdditionResult()
        {
            return this.firsttNumber+this.secondNumber;
        }
        public double getSubtractionResult()
        {
            return this.firsttNumber-this.secondNumber;
        }
        public double getMultiplicationResult()
        {
            return this.firsttNumber*this.secondNumber;
        }
        public double getDivisionResult()
        {
            if(this.secondNumber==0)
            {
                return 0;
            }
            else
            {
                return this.firsttNumber/this.secondNumber;
            }
        }
}
