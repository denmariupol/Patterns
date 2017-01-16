/**
 * Created by den on 2017-01-16.
 */
public class Facade {
    public void activity(){
        Job job =new Job();
        Builder builder = new Builder();
        Schedule schedule = new Schedule();
        job.buildHouse();
        schedule.setWork(true);
        builder.buildingHouse(schedule.isWork());

        schedule.setWork(false);

        builder.buildingHouse(schedule.isWork());
    }
}
