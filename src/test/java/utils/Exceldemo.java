package utils;

public class Exceldemo {
    public static void main(String[] args) {
        Excelutils excel= new Excelutils();
        excel.getRowCount(0,0);
        excel.getcelldata(0,0);
        excel.getcelldatanumber(1,0);
    }
}
