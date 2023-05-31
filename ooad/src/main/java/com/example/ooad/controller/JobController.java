package com.example.ooad.controller;

import com.example.ooad.entity.*;
import com.example.ooad.responsitory.*;
import com.example.ooad.service.UserCheck;
import com.example.ooad.service.UserDetailsServiceImpl;
import com.example.ooad.util.EncrytedPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5501/")
@RestController
public class JobController {
    @Autowired
    JobResponsitory jobResponsitory;

    @Autowired
    CompanyResponsitory companyResponsitory;

//    @GetMapping("/hn")
//    public List<String> getJob(){
//        List<String>  jobs= new ArrayList<>();
//        List<Company> companyList= companyResponsitory.findAll();
//
//
//        for(int i=0;i<companyList.size();i++){
//            jobs.add(companyList.get(i).getAddressCity())
//        }
//        return jobs ;
//    }

    @GetMapping("/field/{linhvuc}")
    public List<Job> getJobByField(@PathVariable String linhvuc){
        if(linhvuc.equals("kinhte")){
            linhvuc = "Kinh tế";
        }
        System.out.println(linhvuc);

        List<Job> jobList = jobResponsitory.getByField(linhvuc);
        return jobList;
    }

//    @Autowired
//    UserCheck userCheck;

    @GetMapping("/username")
    public String UserName(){
        UserDetailsServiceImpl userDetailsService = new UserDetailsServiceImpl();

        String name=UserCheck.name;
        return name;
    }
    @GetMapping("/iduser")
    public Integer iduser(){
        UserDetailsServiceImpl userDetailsService = new UserDetailsServiceImpl();
        Integer id = UserCheck.id;
        return id;

    }


    @GetMapping("/jobs")
    public List<Job> getJob(){
        List<Job> jobs =jobResponsitory.findAll();

        return jobs;
    }



    @PostMapping("/jobs")
    public String addjob(@RequestBody Job job){
        jobResponsitory.save(job);
        return null;

    }

    @GetMapping("/jobs/owner/{username}")
    public List<Job> getJobByOwner(@PathVariable String username){
        List<Job> job =jobResponsitory.getByOwner(username);
        return job;
    }



    @GetMapping("/jobs/{id}")
    public Job getbyIDJob(@PathVariable Long id){
        Job job = jobResponsitory.findById(Math.toIntExact(id)).orElseThrow(RuntimeException::new);
        return job;

    }






//    JobService jobService = new JobService();
    @GetMapping("job-company/{destination}")
    public List<Job> getJobByDestination(@PathVariable String destination){

        List<Company> companyList= companyResponsitory.findAll();

        List<Integer> companyDestination = new ArrayList<>();
        for(int i=0;i<companyList.size();i++){
            if(companyList.get(i).getAddressCity().equals(destination)){
                companyDestination.add(companyList.get(i).getCompanyId());

            }
        }

        return  jobResponsitory.getJobByDestination(companyDestination);
    }

//    @GetMapping("job-company/{destination}/{field}")
//    public String getJ(@PathVariable String destination, @PathVariable String field){
//        return destination +"  va " + field;
//    }


    @GetMapping("job-company/{destination}/{field}")
    public List<Job> getJobByDestinationandField(@PathVariable String destination, @PathVariable String field){

        List<Company> companyList= companyResponsitory.findAll();

        List<Integer> companyDestination = new ArrayList<>();
        for(int i=0;i<companyList.size();i++){
            if(companyList.get(i).getAddressCity().equals(destination)){
                companyDestination.add(companyList.get(i).getCompanyId());

            }
        }

        List<Job> jobs = jobResponsitory.getJobByDestinationandField(companyDestination,field);

        return  jobs;
    }

//    @Autowired
//    AccountRepository accountRepository;
//
//    @GetMapping("account")
//    public List<Account> accounts(){
//        List<Account> accountList = accountRepository.findAll();
//        return accountList;
//    }




    @Autowired
    AppliedJobRepository appliedJobRepository;

    @GetMapping("appliedjob")
    public List<AppliedJob> appliedJobList(){
        List<AppliedJob> appliedJobList = appliedJobRepository.findAll();
        return appliedJobList;
    }

    @PostMapping("appliedjob")
    public String postAppliedjob(@RequestBody AppliedJob appliedJob){
        appliedJobRepository.save(appliedJob);
        return null;
    }

    @GetMapping("appliedjobb/{name}")
    public List<AppliedJob> appliedJob( @PathVariable String name){
        String userName = name;


        List<AppliedJob> appliedJobList = appliedJobRepository.getByName(userName);
        return appliedJobList;
    }

    @GetMapping("appliedjob/{id}")
    public List<AppliedJob> appliedJobb(@PathVariable Integer id){
        List<AppliedJob> appliedJobList =  appliedJobRepository.ID(id);
        return appliedJobList;
    }

    @GetMapping("getappliedjob/{name}")
    public List<AppliedJob> getappliedJob( @PathVariable String name){
        String userName = name;


        List<AppliedJob> appliedJobList = appliedJobRepository.NTDGET(userName);
        return appliedJobList;
    }

    @GetMapping("getappliedjob/{kn}/{dd}/{hv}")
    public List<AppUser> getappliedJobbbb( @PathVariable String kn,@PathVariable String dd,@PathVariable String hv){

        if(kn.equals("3")){
            kn="3 năm";
        }

        if(kn.equals("5")){
            kn="5 năm";
        }

        if(hv.equals("dh")){
            hv="Đại học";
        }

        if(hv.equals("c3")){
            hv="Cấp 3";
        }


        List<AppUser> appliedJobList = appUserRepository.Suggestion(kn,dd,hv);
        return appliedJobList;
    }



//    @GetMapping("getaccount/{exp}/{skill}/{salary}/{location}")
//    public List<Account> getAccount(@PathVariable String exp , @PathVariable String skill, @PathVariable String salary,@PathVariable String location){
//        int Intsalary = Integer.parseInt(salary);
//        exp += " nam";
//        List<Account> accountList = accountRepository.get(exp,skill,Intsalary,location);
//        return accountList;
//    }


//    @GetMapping("appliedJobbyAccount/{id}")
//    public List<AppliedJob> appliedJobList (@PathVariable  String id){
//
//    }




    @GetMapping("company")
    public List<Company> getAllCompany(){
        return companyResponsitory.findAll();
    }

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("user")
    public List<AppUser> getAppsuer(){
        return appUserRepository.findAll();
    }

    @Autowired
    UserRoleRepository userRoleRepository;
    @PutMapping("user/{id}")
    public String putUser(@RequestBody AppUser appUser,@PathVariable Long id) {
        AppUser appUser1 = appUserRepository.findById(id).orElseThrow(RuntimeException::new);
        appUser1.setName(appUser.getName());
        appUser1.setSkill(appUser.getSkill());
        appUser1.setLocation(appUser.getLocation());
        appUser1.setMinWage(appUser.getMinWage());
        appUser1.setMaxWage(appUser.getMaxWage());
        appUserRepository.save(appUser1);
        return null;

    }


    @PostMapping("user")
    public String addUser(@RequestBody AppUser appUser){
        AppUser appUser1 = appUser;
        String newpass = appUser.getEncrytedPassword();
        EncrytedPasswordUtils encrytedPasswordUtils = new EncrytedPasswordUtils();
        String realnewpass = encrytedPasswordUtils.encrytePassword(newpass);
        appUser1.setEncrytedPassword(realnewpass);
        appUser1.setEnabled(true);

        appUserRepository.save(appUser1);
        List<AppUser> appUserList = appUserRepository.findAll();
        int max = 0;
        for(int i = 0;i<appUserList.size();i++){
            if(appUserList.get(i).getUserId()>max){
                max = Math.toIntExact(appUserList.get(i).getUserId());
            }

        }
//        System.out.println(appUserRepository.idUserRole().get(0).getUserId());
//        Long id = Long.valueOf(appUserRepository.idUserRole());
        AppUser appUser2 = appUser1;
        AppRole appRole = new AppRole(2L,"ROLE_USER");
        appUser2.setUserId((long) max);
        UserRole userRole = new UserRole(appUser2,appRole);
        userRoleRepository.save(userRole);
        return null;
    }

    @GetMapping("appuser")
    public List<AppUser> Appuser(){
        List<AppUser> accountList = appUserRepository.findAll();
        return accountList;
    }

    @GetMapping("appuser/{id}")
    public AppUser getappuser(@PathVariable Long id){
        AppUser appUser = appUserRepository.findById(id).orElseThrow(RuntimeException::new);
        return appUser;
    }


    @PutMapping("appuser/{id}")
    public String putAppuser(@PathVariable Long id,@RequestBody AppUser appuser){
        AppUser appUser=appUserRepository.findById(id).orElseThrow(RuntimeException::new);;
        appUser.setLinkCV(appuser.getLinkCV());
        appUserRepository.save(appUser);
        return null;

    }

    @GetMapping("company/{username}")
    public Company getCompanyByOwner(@PathVariable String username){
        List<Company> company = companyResponsitory.getByName(username);
        return company.get(0);

    }



}
