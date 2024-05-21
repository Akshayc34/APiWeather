package com.comp30231.coursework;

public class TripProposal {
    private String userId;
    private String tripId;
    private String location;
    private String startDate;
    private String endDate;
  
    public String getUserId() {
      return userId;
    }
  
    public void setUserId(String userId) {
      this.userId = userId;
    }

    public String getTripId() {
      return tripId;
    }
  
    public void setTripId(String tripId) {
      this.tripId = tripId;
    }
    
    public String getLocation() {
      return location;
    }
  
    public void setLocation(String location) {
      this.location = location;
    }

    public String getStartDate() {
      return startDate;
    }
  
    public void setStartDate(String startDate) {
      this.startDate = startDate;
    }

    public String getEndDate() {
      return endDate;
    }
  
    public void setEndDate(String endDate) {
      this.endDate = endDate;
    }
}
