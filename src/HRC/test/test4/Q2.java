package HRC.test.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<SalesRecord> salesRecordList = readFileFromCSV("src\\SalesRecords.csv");

        Set<String> yearSet = new HashSet<>();

        for (int i = 0; i < salesRecordList.size(); i++) {
            String splitDate[] = salesRecordList.get(i).orderDate.split("/");
            yearSet.add(splitDate[splitDate.length-1]);
        }

        String uniqueYearList[] = new String[yearSet.size()];
        int k=0;


        for (String s : yearSet) {
            uniqueYearList[k] = s;
            k++;
        }


        Comparator<SalesRecord> comparator = new Comparator<SalesRecord>() {
            @Override
            public int compare(SalesRecord o1, SalesRecord o2) {
                return o1.getTotalProfit()>o2.getTotalProfit()?1:-1;
            }
        };


        List<SalesRecord> temporarySalesRecordList = new ArrayList<>();
        for (int i = 0; i < uniqueYearList.length; i++) {
            for (SalesRecord j:salesRecordList) {
                String splitDate[] = j.orderDate.split("/");
                if (splitDate[splitDate.length - 1].equals(uniqueYearList[i])){
                    temporarySalesRecordList.add(j);
                }

            }

            List<SalesRecord> sortedList = new ArrayList<>();
            Collections.sort(temporarySalesRecordList,comparator);
            for (SalesRecord l : temporarySalesRecordList) {
                sortedList.add(l);
            }

            System.out.println("Highest profit value of "+uniqueYearList[i]+" year = "+sortedList.get(sortedList.size()-1));

            temporarySalesRecordList.clear();
            sortedList.clear();


        }

    }

    public static List<SalesRecord> readFileFromCSV (String fileName){
        List<SalesRecord> salesRecordList = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)){
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                String [] variable = line.split(",");
                List<String> list = Arrays.asList(variable);
                if(list.contains("NA")) {
                    break;
                } else {
                    SalesRecord dataset = createRecord(variable);
                    salesRecordList.add(dataset);
                }
                line = br.readLine();
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return salesRecordList;
    }



    private static SalesRecord createRecord(String [] metadata) {
//Region,Country,Item Type,Sales Channel,Order Priority,Order Date,Order ID,Ship Date,Units Sold,Unit Price,Unit Cost,Total Revenue,Total Cost,Total Profit
        String region  = metadata[0];
        String country = metadata[1];
        String itemType = metadata[2];
        String orderDate = metadata[5];
        String unitsSold = metadata[8];
        Double totalProfit = Double.parseDouble(metadata[13]);

        return new SalesRecord(region, country, itemType, orderDate,unitsSold, totalProfit);
    }
}

class SalesRecord {
    String region;
    String country;
    String itemType;
    String orderDate;
    String unitsSold;
    Double totalProfit;

    public SalesRecord(String region, String country, String itemType, String orderDate, String unitsSold, Double totalProfit) {
        this.region = region;
        this.country = country;
        this.itemType = itemType;
        this.orderDate = orderDate;
        this.unitsSold = unitsSold;
        this.totalProfit = totalProfit;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        return "SalesRecord1{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", itemType='" + itemType + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", unitsSold='" + unitsSold + '\'' +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
