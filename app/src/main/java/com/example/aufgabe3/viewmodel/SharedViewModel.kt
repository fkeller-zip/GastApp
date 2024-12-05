package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel : ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(booking: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value + booking
    }

    fun deleteBookingEntry(booking: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value.filterNot { it == booking }
    }
}
