/**
 * Created by Dado on 13.1.2015.
 */
package model;
public class Parking {
    public Parking() {
    }
    private int _parkingID;
    private double _longitude;
    private double _latitude;
    private String _creator;
    private int _totalnumber;
    private float _price;
    private String _note;
    private int _pictureID;
    private int _gradeUser;
    private Boolean _isthereLight;
    private Boolean _isthereRoad;
    private Boolean _isthereCamera;
    private Boolean _isthereGuard;
    private Boolean _isthereGoodEntrance;
    private Boolean _isthereRoof;
    private float _secrating;
    private float _ovrrating;
    private String _telefon;
    private int _freespots;
    private int _takenspots;
    private int _city;

    private int _results;
    public int get_results() {
        return _results;
    }

    public void set_results(int _results) {
        this._results = _results;
    }

    public String get_isVerificated() {
        return _isVerificated;
    }

    public void set_isVerificated(String _isVerificated) {
        this._isVerificated = _isVerificated;
    }

    private String _isVerificated;
    public int get_city() {
        return _city;
    }

    public void set_city(int _city) {
        this._city = _city;
    }

    public int get_parkingID() {
        return _parkingID;
    }

    public void set_parkingID(int _parkingID) {
        this._parkingID = _parkingID;
    }
    public int get_totalnumber() {
        return _totalnumber;
    }

    public void set_totalnumber(int _totalnumber) {
        this._totalnumber = _totalnumber;
    }

    public float get_price() {
        return _price;
    }

    public void set_price(float _price) {
        this._price = _price;
    }

    public String get_note() {
        return _note;
    }

    public void set_note(String _note) {
        this._note = _note;
    }

    public int get_pictureID() {
        return _pictureID;
    }

    public void set_pictureID(int _pictureID) {
        this._pictureID = _pictureID;
    }
    public int get_gradeUser() {
        return _gradeUser;
    }

    public void set_gradeUser(int _gradeUser) {
        this._gradeUser = _gradeUser;
    }

    public Boolean get_isthereLight() {
        return _isthereLight;
    }

    public void set_isthereLight(Boolean _isthereLight) {
        this._isthereLight = _isthereLight;
    }

    public Boolean get_isthereRoad() {
        return _isthereRoad;
    }

    public void set_isthereRoad(Boolean _isthereRoad) {
        this._isthereRoad = _isthereRoad;
    }

    public Boolean get_isthereCamera() {
        return _isthereCamera;
    }

    public void set_isthereCamera(Boolean _isthereCamera) {
        this._isthereCamera = _isthereCamera;
    }

    public Boolean get_isthereGuard() {
        return _isthereGuard;
    }

    public void set_isthereGuard(Boolean _isthereGuard) {
        this._isthereGuard = _isthereGuard;
    }

    public Boolean get_isthereGoodEntrance() {
        return _isthereGoodEntrance;
    }

    public void set_isthereGoodEntrance(Boolean _isthereGoodEntrance) {
        this._isthereGoodEntrance = _isthereGoodEntrance;
    }

    public double get_latitude() {
        return _latitude;
    }

    public void set_latitude(double _latitude) {
        this._latitude = _latitude;
    }

    public double get_longitude() {
        return _longitude;
    }

    public void set_longitude(double _longtitude) {
        this._longitude = _longtitude;
    }

    public Boolean get_isthereRoof() {
        return _isthereRoof;
    }

    public void set_isthereRoof(Boolean _isthereRoof) {
        this._isthereRoof = _isthereRoof;
    }

    public float get_secrating() {
        return _secrating;
    }

    public void set_secrating(float _secrating) {
        this._secrating = _secrating;
    }

    public float get_ovrrating() {
        return _ovrrating;
    }

    public void set_ovrrating(float _ovrrating) {
        this._ovrrating = _ovrrating;
    }

    public String get_telefon() {
        return _telefon;
    }

    public void set_telefon(String _telefon) {
        this._telefon = _telefon;
    }

    public String get_creator() {
        return _creator;
    }

    public void set_creator(String _creator) {
        this._creator = _creator;
    }

    public int get_freespots() {
        return _freespots;
    }

    public void set_freespots(int _freespots) {
        this._freespots = _freespots;
    }

    public int get_takenspots() {
        return _takenspots;
    }

    public void set_takenspots(int _takenspots) {
        this._takenspots = _takenspots;
    }
    @Override
    public String toString() {
        return "Parking#"+this.get_parkingID();
    }
}

