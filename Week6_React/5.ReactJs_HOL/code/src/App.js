import logo from './logo.svg';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 
import styles from './CohortDetails.module.css'; 
function App() {
 
  return (
  <div>
    <h1>Cohorts Details</h1>
    <div className={styles.wrapper}>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
    </div>
  </div>
  );
}

export default App;
