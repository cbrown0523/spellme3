package com.spellme3.spellme3.model;

public class Tutor {
   private Long id;
   private Tutor_SearchLR more_locations_link;

   public Tutor() {
   }

   public Tutor(Long id, Tutor_SearchLR more_locations_link) {
      this.id = id;
      this.more_locations_link = more_locations_link;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Tutor_SearchLR getMore_locations_link() {
      return more_locations_link;
   }

   public void setMore_locations_link(Tutor_SearchLR more_locations_link) {
      this.more_locations_link = more_locations_link;
   }
}