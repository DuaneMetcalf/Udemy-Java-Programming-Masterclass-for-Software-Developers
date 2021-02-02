public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int numberOfBuckets = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            numberOfBuckets = -1;
        }else{
            double area = width * height;
            double coverage = areaPerBucket * extraBuckets;
            numberOfBuckets = (int) Math.ceil((area - coverage) / areaPerBucket);
        }

        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int numberOfBuckets = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            numberOfBuckets = -1;
        }else{
            double area = width * height;

            numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
        }

        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int numberOfBuckets = 0;

        if ((area <= 0) || (areaPerBucket <= 0)){
            numberOfBuckets = -1;
        }else{
            numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
        }

        return numberOfBuckets;
    }
}