public class Employee {
    private String name;
    private String email;
    private int hourRate;
    private int capacity;
    private int freeDays;
    public void setName(String name1){
        this.name = name1;
    }
    public String getName(){
        return this.name;
    }

    public void setEmail(String email1){
        this.email = email1;
    }

    public String getEmail(){
        return email;
    }
    public void setHourRate(Integer hourRate1){
        this.hourRate = hourRate1;
    }

    public Integer getHourRate(){
        return hourRate;
    }
    public void setCapacity(Integer capacity1){
        this.capacity=capacity1;
    }
    public Integer getCapacity()
    {
        return capacity;
    }
    public void setFreeDays(Integer freeDays1)
    {
        this.freeDays=freeDays1;
    }
    public Integer getFreeDays()
    {
        return freeDays;
    }

    public int calculateDailyIncome(){
        return hourRate*capacity;
    }
    public int calculateMonthlyIncome(){
        int numberOfDays = 28;
        return (numberOfDays - freeDays)*hourRate*capacity;
    }
}