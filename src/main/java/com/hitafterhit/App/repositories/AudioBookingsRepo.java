package com.hitafterhit.App.repositories;

import com.hitafterhit.App.models.AudioBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioBookingsRepo extends JpaRepository<AudioBookings, Long> {
}