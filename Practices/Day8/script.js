// Define an object to store current slide index for each category
const currentSlides = {};

function showSlide(category, index) {
    const slides = document.querySelector('#' + category + ' .app-cards');
    const totalSlides = slides.children.length;
    const cardWidth = slides.children[0].offsetWidth + 40; // card width + margin
    const maxSlides = Math.floor(document.querySelector('.carousel-container').clientWidth / cardWidth);

    if (!currentSlides[category]) {
        currentSlides[category] = 0;
    }

    if (index >= totalSlides - maxSlides) {
        currentSlides[category] = totalSlides - maxSlides;
        document.querySelector('#' + category + ' .next-btn').disabled = true;
    } else {
        currentSlides[category] = index;
        document.querySelector('#' + category + ' .next-btn').disabled = false;
    }

    if (currentSlides[category] <= 0) {
        currentSlides[category] = 0;
        document.querySelector('#' + category + ' .prev-btn').disabled = true;
    } else {
        document.querySelector('#' + category + ' .prev-btn').disabled = false;
    }

    slides.style.transform = `translateX(-${currentSlides[category] * cardWidth}px)`;
}

function nextSlide(category) {
    showSlide(category, currentSlides[category] + 1);
}

function prevSlide(category) {
    showSlide(category, currentSlides[category] - 1);
}

document.addEventListener('DOMContentLoaded', () => {
    showSlide('action-games', 0); // Initialize the first category
    showSlide('puzzle-games', 0); // Initialize the second category
    // Add similar initialization for other categories if needed
    
    // Enable the previous button for the first slide in each category
    document.querySelectorAll('.carousel-section').forEach(section => {
        const category = section.getAttribute('id');
        document.querySelector('#' + category + ' .prev-btn').disabled = false;
    });
});
