package menu.kiran.company1;

public class Client
{
        String id,name,address,asset,company,quantity,date1,date2;

        public Client()
        {

        }



        public Client(String id,String name, String address, String asset, String company, String quantity,String date1,String date2)
        {
            this.id = id;
            this.name = name;
            this.address = address;
            this.asset = asset;
        this.company = company;
        this.quantity = quantity;
        this.date1 = date1;
        this.date2 = date2;


    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAsset()
    {
        return asset;
    }

    public void setAsset(String asset)
    {
        this.asset = asset;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }
}
