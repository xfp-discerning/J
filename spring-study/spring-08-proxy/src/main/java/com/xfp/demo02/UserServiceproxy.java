package com.xfp.demo02;

public class UserServiceproxy implements UserService{
//    UserServiceImpl userService = new UserServiceImpl();

    private UserServiceImpl userService;//定义私有

    //set依赖注入
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        System.out.println("拓展了业务");
        log();
    }

    @Override
    public void delete() {
        userService.delete();
        System.out.println("拓展了业务");
        log();
    }

    @Override
    public void update() {
        userService.update();
        System.out.println("拓展了业务");
        log();
    }

    @Override
    public void query() {
        userService.query();
        System.out.println("拓展了业务");
        log();
    }

    public void log(){
        System.out.println("打印了日志");
    }
}
