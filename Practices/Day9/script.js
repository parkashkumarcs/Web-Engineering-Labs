document.addEventListener('DOMContentLoaded', function() {
    const allApps = [
        { type: "Social", name: "Facebook", image: "images/face.png", description: "Facebook is a way to find and connect with friends and remain updated on their activities.", rating: 4.8, downloads: "5M+" },
        { type: "Utility", name: "Google Translator", image: "images/translate.png", description: "Google Translate Translation Android, noodle, blue, english,", rating: 4.8, downloads: "4M+" },
        { type: "Game", name: "Call of Duty Mobile", image: "images/cod.png", description: "Legends of War, and Elite Squad in its pre-alpha phase) is a free-to-play mobile first-person shooter that was released first in Alpha on December 15th, 2018 for Android systems only in Australia.[2]", rating: 4.5, downloads: "1M+" },
        { type: "Game", name: "Pubg Mobile", image: "images/pubg.png", description: "PUBG Mobile is a free-to-play battle royale video game co-developed by LightSpeed & Quantum Studio and PUBG Studios.", rating: 5, downloads: "500M+" },
        { type: "Utility", name: "Adobe PDF Reader:", image: "images/pdf.png", description: "Adobe PDF icon, Adobe Acrobat Adobe Reader Computer Icons PDF, pdf, text, logo", rating: 4.2, downloads: "2.5M+" },
        { type: "Game", name: "Subway Surfers", image: "images/subway.png", description: "Subway Surfers is a single player mobile gaming app and website developed by Kiloo.", rating: 4, downloads: "2M+" },
        { type: "Game", name: "Gunship Battle 3D", image: "images/gunship.png", description: "『GUNSHIP BATTLE』 is a helicopter action game that combines stunning 3D graphics with flight control simulation and engaging military scenarios.", rating: 4.7, downloads: "3M+" },
        { type: "Game", name: "Helicopter Simulator GUNSHIP BATTLE", image: "images/gunsimulate.png", description: "Warships fleet and cobra helicopters are getting closer and closer to land, putting the nation into real danger of apache combat strikes.", rating: 4.2, downloads: "1.5M+" },
        { type: "Social", name: "Instagram", image: "images/insta.png", description: "Instagram is a free photo and video sharing app available on iPhone and Android.", rating: 4.6, downloads: "3M+" },
        { type: "Social", name: "TikTok", image: "images/tik.png", description: "TikTok is a social media platform for creating, sharing and discovering short videos.", rating: 4.4, downloads: "2.5M+" },
        { type: "Social", name: "Whatsapp", image: "images/whats.png", description: "WhatsApp is a free cross-platform messaging service. ", rating: 4.9, downloads: "4M+" },
        { type: "Social", name: "Twitter", image: "images/x.png", description: "Twitter is a free social networking site where users broadcast short posts known as tweets.", rating: 4.7, downloads: "3.5M+" },
        { type: "Utility", name: "Microsoft Word: Edit Documents", image: "images/micro.png", description: "Microsoft's Immersive Reader is a free tool, built into Word, OneNote, Outlook, Office Lens, Microsoft Teams, Reading Progress, Forms", rating: 4.3, downloads: "2M+" },
        { type: "Utility", name: "File Manager ESS", image: "images/file.png", description: "The File Manager is a system software responsible for the creation, deletion, modification of the files and managing their access, security.", rating: 4.5, downloads: "1.5M+" },
        { type: "Utility", name: "Notepad++ Microsoft Office", image: "images/note.png", description: "Microsoft Office, microsoft, computer Program, microsoft", rating: 4.6, downloads: "3M+" }
    ];

    const appContainer = document.getElementById('app-container');

    function generateAppCard(app) {
        const downloadPage = `download-${app.name.toLowerCase().replace(/ /g, '-')}.html`;
        return `
            <div class="app-card">
                <img src="${app.image}" alt="${app.name}">
                <h2>${app.name}</h2>
                <p>${app.description}</p>
                <div class="rating">
                    ${'★'.repeat(app.rating)}
                </div>
                <p>Total Downloads: ${app.downloads}</p>
                <div class="download-buttons">
                    <a href="${downloadPage}" class="download-button">Download</a>
                </div>
            </div>
        `;
    }

    function populateApps(apps) {
        appContainer.innerHTML = '';
        apps.forEach(app => {
            const card = generateAppCard(app);
            appContainer.innerHTML += card;
        });
    }

    document.getElementById('all').addEventListener('click', () => populateApps(allApps));
    document.getElementById('games').addEventListener('click', () => {
        const gamesApps = allApps.filter(app => app.type === "Game");
        populateApps(gamesApps);
    });
    document.getElementById('social').addEventListener('click', () => {
        const socialApps = allApps.filter(app => app.type === "Social");
        populateApps(socialApps);
    });
    document.getElementById('utilities').addEventListener('click', () => {
        const utilityApps = allApps.filter(app => app.type === "Utility");
        populateApps(utilityApps);
    });

    document.getElementById('search-input').addEventListener('input', function(event) {
        const query = event.target.value.toLowerCase();
        const filteredApps = allApps.filter(app => app.name.toLowerCase().includes(query));
        populateApps(filteredApps);
    });

    populateApps(allApps);
});
