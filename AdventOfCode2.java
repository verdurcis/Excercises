package AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * PART 1
 * The elves are running low on wrapping paper, and so they need to submit an order for more.
 * They have a list of the dimensions (length l, width w, and height h) of each present,
 * and only want to order exactly as much as they need.

 * Fortunately, every present is a box (a perfect right rectangular prism),
 * which makes calculating the required wrapping paper for each gift a little easier:
 * find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l.
 * The elves also need a little extra paper for each present: the area of the smallest side.

 * For example:

 * A present with dimensions 2x3x4 (lxwxh) requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper
 * plus 6 square feet of slack, for a total of 58 square feet.

 * A present with dimensions 1x1x10 (lxwxh) requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper
 * plus 1 square foot of slack, for a total of 43 square feet.

 * All numbers in the elves' list are in feet.
 * How many total square feet of wrapping paper should they order?

 * PART 2
 * The elves are also running low on ribbon. Ribbon is all the same width, so they only have to worry about the length they need to order,
 * which they would again like to be exact.

 * The ribbon required to wrap a present is the shortest distance around its sides, or the smallest perimeter of any one face.
 * Each present also requires a bow made out of ribbon as well; the feet of ribbon required for the perfect bow is equal to the cubic feet of volume of the present.
 * Don't ask how they tie the bow, though; they'll never tell.

 * For example:

 * A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of ribbon to wrap the present plus 2*3*4 = 24 feet of ribbon for the bow, for a total of 34 feet.
 * A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus 1*1*10 = 10 feet of ribbon for the bow, for a total of 14 feet.
 * How many total feet of ribbon should they order?
 **/


public class AdventOfCode2 {

    public static void main(String[] args) throws FileNotFoundException {
        List <String> fileList = puzzleInputReader();

        ResultContainerSum sum = getSum(fileList);
        ResultContainerRibbon ribbon = getRibbon(fileList);

        printResults(sum.getSum(), ribbon.getRibbon());
    }
    

    private static void printResults(int sum, int ribbon) {
        System.out.println(STR."The elves need: \{sum} feet of wrapping paper.");
        System.out.println(STR."The elves need: \{ribbon} feet of ribbon");
    }
    public static List<String> puzzleInputReader () throws FileNotFoundException {
        File file = new File("C:\\Users\\Durcova\\IdeaProjects\\Java Project\\src\\AdventOfCode\\input adventofcode 2.txt");
        Scanner scan = new Scanner(file);
        List <String> fileList = new ArrayList<>();

        while (scan.hasNextLine()) {
            fileList.add(scan.nextLine());
        }
        return fileList;
    }

    public static List<Integer> getHeightList (List <String> fileList) {
        List <Integer> heightList = new ArrayList<>();

        for (String line : fileList) {
            String[] diameters = line.split("x");

            int height = Integer.parseInt(diameters[2]);
            heightList.add(height);
        }
        return heightList;
    }

    public static List<Integer> getLengthList (List <String> fileList) {
        List <Integer> lengthList = new ArrayList<>();

        for (String line : fileList) {
            String[] diameters = line.split("x");

            int length = Integer.parseInt(diameters[0]);
            lengthList.add(length);
        }
        return lengthList;
    }

    public static List<Integer> getWidthList (List <String> fileList) {
        List <Integer> widthList = new ArrayList<>();

        for (String line : fileList) {
            String[] diameters = line.split("x");

            int width = Integer.parseInt(diameters[1]);
            widthList.add(width);
        }
        return widthList;
    }

    public static ResultContainerSum getSum (List <String> fileList) {
        List<Integer> length = getLengthList(fileList);
        List<Integer> width = getWidthList(fileList);
        List<Integer> heigth = getHeightList(fileList);
        int sum = 0;


        for (int l = 0, w = 0, h = 0; l < length.size() && w < width.size() && h < heigth.size(); ++l, ++w, ++h) {
            int valueOfL = length.get(l);
            int valueOfW = width.get(w);
            int valueOfH = heigth.get(h);

            int area1 = valueOfL * valueOfW;
            int area2 = valueOfW * valueOfH;
            int area3 = valueOfH * valueOfL;

            // find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l
            int surfaceArea = 2*(area1 + area2 + area3);
            int smallestArea = Math.min(Math.min(area1, area2), area3);
            int totalArea = surfaceArea + smallestArea;

            sum += totalArea;
        }
        return new ResultContainerSum(sum);
    }

    public static ResultContainerRibbon getRibbon (List <String> fileList) {
        List<Integer> length = getLengthList(fileList);
        List<Integer> width = getWidthList(fileList);
        List<Integer> heigth = getHeightList(fileList);
        int ribbon = 0;

        for (int l=0, w=0, h=0; l<length.size() && w<width.size() && h<heigth.size(); ++l, ++w, ++h) {
            int valueOfL = length.get(l);
            int valueOfW = width.get(w);
            int valueOfH = heigth.get(h);

            int[] areas = {valueOfH, valueOfL, valueOfW};
            Arrays.sort(areas);

            int ribbonMeasurments = (areas[0] + areas[0] + areas[1] + areas[1]);
            int bowMeasurements = (valueOfH * valueOfL * valueOfW);
            int totalArea = bowMeasurements + ribbonMeasurments;

            ribbon += totalArea;
        }

        return new ResultContainerRibbon(ribbon);
    }
}

class ResultContainerSum {
    private int sum;

    public ResultContainerSum(int sum) {
        this.sum = sum;
    }
    public int getSum() {return this.sum;}
}

class ResultContainerRibbon {
    private int ribbon;

    public ResultContainerRibbon(int ribbon) {
        this.ribbon = ribbon;
    }
    public int getRibbon() {return this.ribbon;}
}








