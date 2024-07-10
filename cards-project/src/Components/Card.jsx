import profilePic from '../assets/pk.jpg'
function Card(){
    return(
        <div className='card'>
            <img src={profilePic} alt="profile_image" className="card-image"></img>
            <h3 className="card-title">Parkash Kumar</h3>
            <p className="card-text">I am a student of computer Science</p>
        </div>
    );
}
export default Card;